import { ErrorMessage, Field, Form, Formik } from 'formik'
import React from 'react'
import * as Yup from 'yup'

const FormikField = () => {
    return(
        <Formik
            initialValues ={{firstName: ''}}
            validationSchema={ Yup.object({
                firstName: Yup.string()
                .max(10,'Must Enter 10 char or less')
                .required('reqired')
            })}            
                     
            onSubmit = {(values ,{setSubmitting}) =>{
                    setTimeout(() => {
                        alert(values, null,2)
                        setSubmitting(false)
                    }, 500);

            }
            }  
               
        >
            <Form>
                <label htmlFor='firstName'>FirstName</label>
                <Field name='firstName' type='text'/>
                <ErrorMessage name='firstName'/>
                <button type='submit'>Submit</button>
            </Form>
        </Formik>
    )
}
export default FormikField;