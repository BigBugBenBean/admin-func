import React, { Component } from 'react';
import { bindActionCreators } from 'redux';
import { connect } from 'react-redux';

import Header from '../../components/Header/header';

// import { doLogin } from '../../actions/login-action';

// import './login.css';
import '../../styles/style.css';

class LandingContainer extends Component {


    render() {
        return (
          <div >
              {/* <h1>123123</h1> */}
              <Header />
              {/* <h1>565676</h1> */}


{/*
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
              <div className="flex-container">
                <div className="flex-item-1 field-name content-user-id-left">
                  <b>User ID :</b>
                </div>
                <div className="flex-item-2 field-name content-user-id-right">
                  <input name="username" />
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1 field-name content-password-left">
                  <b>Password :</b>
                </div>
                <div className="flex-item-2 field-name content-password-right">
                  <input name="password" type="password" />
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1"></div>
                <div className="flex-item-2">
                  <input type="button" className="ButtonStyle login-confirm" value="Confirm"  />
                  <input type="button" className="ButtonStyle login-clear" value="Clear" />
                </div>
              </div>
            </div>
            <div></div> */}

          </div>
        );
    }
}

function mapStateToProps(state) {
    return {

    };
}

function matchDispatchToProps(dispatch){
    return bindActionCreators({
      // loginClicked: doLogin
    }, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(LandingContainer);
