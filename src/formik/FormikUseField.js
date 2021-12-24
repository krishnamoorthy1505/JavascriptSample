import { Form, Formik, useField } from 'formik';
import React from 'react'

const MyTextInput = ({label , ...props}) =>{
   const [field,meta] = useField(props)
   return(
       <>
       <label htmlFor={props.id || props.name}>{label}</label>
       <input className="text-input" {...field}{...props}/>
       {meta.touched && meta.error ? (<div className='error'>{meta.error}</div>) : null}
        </>
   );
};

 const MyCheckBox =({children,...props}) =>{
    const [field,meta] = useField({...props ,type:'checkbox' })
    return(
        <div>
            <label className='checkbox-input'>
                <input type='checkbox' {...field}{...props}/>
                    {children}
            </label>
            {meta.touched && meta.error ? 
                (<div className="error">{meta.error}</div>
                ) : null}

            
        </div>
    )

} 
    const MySelect =({label, ...props})=>{
        const [field,meta] = useField(props)
        return(
            <div>
                <label htmlFor={props.id || props.name}>{label}</label>
                <select {...field} {...props}></select>
                {meta.touched && meta.error ?(<div>{meta.error}</div>):null}
            </div>
        )
    }

const FormikUseField = () =>{
    return(
    <>
        <h1>ReactUseField</h1>
        <Formik
            onSubmit = { (values, {setSubmitting})=> {
                 setTimeout(()=>{
                    setSubmitting(false)
                 },500)
            }
        }

            
        >
            <Form>
                <MyTextInput label='First Name'
                    name='firstName'
                    type='text'
                    placeholder='krishna'

                        
                />
                <MyTextInput label="LastName"
                    name='lastName'
                    type='text'
                    placeholder='xxxxxx'
                />
                <MyTextInput label="Email"
                    name='email'
                    type='email'
                    placeholder='xxxxx@gmail.com'
                ></MyTextInput>
                <MySelect label='Job Type' name='jobType'>
                    <option value="">Select aJob Type</option>
                    <option value="Developer">Developer</option>
                    <option value="Designer">Designer</option>
                    <option value="Tester">Tester</option>
                                     
                </MySelect>
                <MyCheckBox name='Accept the terms and condition'>
                    Accept the Terms and condition
                </MyCheckBox>


            </Form>
        </Formik>
    </>
)}

export default FormikUseField;