import React from 'react'
import Navbar from '../navbar/Navbar'
import { Navigate,Outlet } from 'react-router-dom'
function PrivateRoute() {
  return (
    <div>
       <Navbar/>
       {true?Outlet:<Navigate to="/login"/>}
    </div>
  )
}
import Navbar from '../navbar/Navbar'
import { Navigate, Outlet } from 'react-router-dom'

export default PrivateRoute