import React from 'react'
import Login from './pages/login/Login'
import Register from './pages/register/Register'
import { Route, Routes } from 'react-router-dom'
 function App() {
  return (
    // <div>
    //   {/* <Login/> */}
    //   <Register/>
    // </div>
    <Routes>
        {/* <Route path='/' element={<PrivateRoute/>}>
            <Route index element={<h1>HOME</h1>}/>
            <Route path='/lesson' element={<h1>LESSON</h1>}/>
        </Route> */}


      <Route path='/login' element={<Login/>}/>
      <Route path='/registration' element={<Register/>}/>
      {/* <Route path='*' element={<h1>ERROR</h1>}/> */}
    </Routes>
    
  )
}
export default App