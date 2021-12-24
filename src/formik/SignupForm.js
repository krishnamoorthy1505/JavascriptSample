/*  import React from 'react';
 import { ReactDOM } from 'react';
import { useFormik } from 'formik';
const SignupForm = () => {
  // Pass the useFormik() hook initial form values and a submit function that will
  // be called when the form is submitted
  const formik = useFormik({
    initialValues: {
      email: '',
    },
    onSubmit: values => {
      alert(JSON.stringify(values, null, 2));
    },
  });
  return (
    <form onSubmit={formik.handleSubmit}>
      <label htmlFor="email">Email Address</label>
      <input
        id="email"
        name="email"
        type="email"
        onChange={formik.handleChange}
        value={formik.values.email}
      />

      <button type="submit">Submit</button>
    </form>
  );
};
export default SignupForm;
//ReactDOM.render(<SignupForm/>,document.getElementById('root'))
 */
 
import React from 'react';
import { useFormik } from 'formik';
import { ReactDOM } from 'react';

const SignupForm = () => {
      const formik = useFormik({
    initialValues: {
      email: '',
    },
    onSubmit: values => {
      alert(JSON.stringify(values, null, 2));
    },
  });

return(
    <form onSubmit={formik.handleSubmit}>
        <label htmlFor='email'>Enter Email</label>
        <input  id='email'
                type='email'
                name='email'
                onChange={formik.handleChange}
                value={formik.values.email}/>
        <button type="submit">submit</button>

    </form>
);
}; 
export default SignupForm;
//ReactDOM.render(<SignupForm/>,document.getElementById('root'))

