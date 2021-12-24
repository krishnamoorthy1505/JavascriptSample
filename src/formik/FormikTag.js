import react  from 'react'
import {Formik, validateYupSchema} from 'formik'
import * as Yup from 'yup'

const FormikTag = () =>{
    return(
    <Formik
        initialValues = {{firstName: '', lastName: '', email:'',}}
        validationSchema = {Yup.object({
                firstName:Yup.string()
                    .max(15,'Must Enter 15 char orless')
                    .required('Reqired'),
                lastName: Yup.string()
                    .max(15,'Must Enter the 15 char or less ')
                    .required('Rqquired'),
                email:Yup.string().email('Valid Email').required('Reqired')

            }
        )} 
        onSubmit= { (values,{ setSubmitting })  =>{
                        setTimeout(() => {
                            alert(JSON.stringify(values, null, 2));
                            setSubmitting(false)

                        }, 500);
                    }
                }
    >
        {formik => (
                     <form onSubmit={formik.handleSubmit}>
                     <label htmlFor="firstName">First Name</label>
                     <input
                       id="firstName"
                       type="text"
                       {...formik.getFieldProps('firstName')}
                     />
                     {formik.touched.firstName && formik.errors.firstName ? (
                       <div>{formik.errors.firstName}</div>
                     ) : null}
           
                     <label htmlFor="lastName">Last Name</label>
                     <input
                       id="lastName"
                       type="text"
                       {...formik.getFieldProps('lastName')}
                     />
                     {formik.touched.lastName && formik.errors.lastName ? (
                       <div>{formik.errors.lastName}</div>
                     ) : null}
           
                     <label htmlFor="email">Email Address</label>
                     <input id="email" type="email" {...formik.getFieldProps('email')} />
                     {formik.touched.email && formik.errors.email ? (
                       <div>{formik.errors.email}</div>
                     ) : null}
           
                     <button type="submit">Submit</button>
                   </form>
          
        )}
    </Formik>
)}

export default FormikTag