import React from 'react'
import { Formik, useFormik } from 'formik'

const validate = values =>{
    const errors = {}
    if(!values.firstName){
        errors.firstName ='required' ;
    }else if(values.firstName.length>15){
        errors.firstName ="Enter name 15 or less"
    }
    if (!values.lastName) {
        errors.lastName = 'Required';
      } else if (values.lastName.length > 20) {
        errors.lastName = 'Must be 20 characters or less';
      }
    
      if (!values.email) {
        errors.email = 'Required';
      } else if (!/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(values.email)) {
        errors.email = 'Invalid email address';
      }
    
      return errors;
   
};
const RegistrationForm = () =>{
    const formik=useFormik({
        initialValues : {
            firstName:'',
            lastName: '',
            email: '',
        },
        validate,
        onSubmit: values =>{
            alert(JSON.stringify(values,null,2))
        },
    });


return(
    <div class='container'>
    <form onSubmit={formik.handleSubmit}>
        <label htmlFor='FirstName'>FirstName :</label>
        <input type='text'
               id='firstName' 
               name='firstName'
               onChange={formik.handleChange}
               onBlur={formik.handleBlur}

               value={formik.values.firstName}
        />
        {formik.touched.firstName && formik.errors.firstName?<div>{formik.errors.firstName}</div>:null}
        <br/>
            
               <label htmlFor='LasttName'>LastName :</label>
        <input type='text'
               id='lastName' 
               name='lastName'
               onChange={formik.handleChange}
               onBlur={formik.handleBlur}

               value={formik.values.lastName}/>
        {formik.touched.lastName && formik.errors.lastName?(<div class='text-danger'>{formik.errors.lastName}</div>):null}
    <br/>
    <label htmlFor='Email'>Email :</label>
        <input type='email'
               id='email' 
               name='email'
               onChange={formik.handleChange}
               onBlur={formik.handleBlur}

               value={formik.values.email}/>
        {formik.touched.email && formik.errors.email?(<div>{formik.errors.email}</div>):null}
      
               
    <br/>
    <button class='btn btn-primary btn-center' type='submit'>sumbit</button>
    
    </form>
    </div>
)};
export default RegistrationForm;