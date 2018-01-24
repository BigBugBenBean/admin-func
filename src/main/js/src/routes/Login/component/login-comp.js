import React from 'react'
import PropTypes from 'prop-types'
import {withRouter} from "react-router-dom";

// import './login-comp.scss';
// import '../../../styles/style.css';

export const Login = ({ dispatchLogin }) => (
         <div>
           {/* <h2 className="test">login</h2> */}
          {/* <div>Login Page</div> */}
            <div className="flex-container">
              <div className="flex-item-1 header-item-left">
                <span>e-Services 2</span>
              </div>
              <div style={{  }}></div>
              <div className="flex-item-1 header-item-right">
                <span>Date: <b>Wednesday, 3 January 2018</b></span>
              </div>
            </div>
            <div className="content-container">
              <div style={{ width:'100%', height: '25px', backgroundColor: '#aa4747' }}>{ }</div>
              <div className="flex-container content-nav-container">
                <div className="flex-item-1 nav-title-left">
                  <span style={{ width: '100%' }}>Login</span>
                </div>
                <div style={{  }}></div>
                <div className="flex-item-1 nav-title-right">
                  <span style={{ width: '100%' }}>ASC0001</span>
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1 field-name content-warning-left">
                  <b>WARNING :</b>
                </div>
                <div className="flex-item-2 field-name content-warning-right">
                  <span>
                  All information contained in or related to the e-Services (the System) is strictly classified. Unauthorized access to the System is prohibited. Any disclosure of the information to unauthorized person or breach of security on information being held in computer connected with the System is liable to prosecution under Computer Crimes Ordinance and Official Secrets Ordinance.
                  </span>
                </div>
              </div>
              <form >
              <div className="flex-container">
                <div className="flex-item-1 field-name content-user-id-left">
                  <b>User ID :</b>
                </div>
                <div className="flex-item-2 field-name content-user-id-right">
                  <input
                 name="username" />
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1 field-name content-password-left">
                  <b>Password :</b>
                </div>
                <div className="flex-item-2 field-name content-password-right">
                  <input
        name="password" type="password"  />
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1"></div>
                <div className="flex-item-2">
                <button type="button" className="ButtonStyle login-confirm" onClick={dispatchLogin} >Login</button>

                  <input type="button" className="ButtonStyle login-clear" value="Clear" />

                  {/* <button type="button"  className="btn btn-secondary btn-block"
                      onClick={dispatchLogin}>Go Counter
                  </button> */}
                </div>
              </div>

              </form>
            </div>
          </div>
)
Login.propTypes = {
//  user: PropTypes.any.isRequired
}

//export default Login
export default withRouter(Login)
