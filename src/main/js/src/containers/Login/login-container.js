import React, { Component } from 'react';
import { bindActionCreators } from 'redux';
import { connect } from 'react-redux';
import { Link, Switch, Route } from 'react-router-dom';

import LandingContainer from '../Landing/landing-container';

 import { doLogin } from '../../actions/login-action';

// import './login.css';
import '../../styles/style.css';

class LoginContainer extends Component {

    constructor(props) {
        super(props);
        this.handleLogin = this.handleLogin.bind(this);
    }

    componentDidMount() {
        this.props.handleLogin();
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.user) {
            // logged in, let's show redirect if any, or show home
            try {
                const { from } = this.props.location.state || {
                    from: { pathname: "/" }
                };
                nextProps.history.replace(from);
            } catch (err) {
                nextProps.history.replace("/");
            }
        }
    }

    handleLogin(event) {
        event.preventDefault();
        const username = this.refs.username;
        const password = this.refs.password;
//        this.props.dispatch(doLogin(username.value, password.value));
//        username.value = "";
//        password.value = "";
    }

    render() {
        return (
            <div >
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
              <div className="flex-container">
                <div className="flex-item-1 field-name content-user-id-left">
                  <b>User ID :</b>
                </div>
                <div className="flex-item-2 field-name content-user-id-right">
                  <input
                ref="username" name="username" />
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1 field-name content-password-left">
                  <b>Password :</b>
                </div>
                <div className="flex-item-2 field-name content-password-right">
                  <input
        ref="password" name="password" type="password" />
                </div>
              </div>
              <div className="flex-container">
                <div className="flex-item-1"></div>
                <div className="flex-item-2">
                <button onClick={this.handleLogin} >Login</button>
                  <Link to={'/landing'}>
                    <input type="button" className="ButtonStyle login-confirm" value="Confirm"  />
                  </Link>

                  <input type="button" className="ButtonStyle login-clear" value="Clear" />
                </div>
              </div>
            </div>
            <div></div>
          </div>
        );
    }
}

function mapStateToProps(state) {
    const { auth } = state;
    if (auth) {
        return { user: auth.user, loginError: auth.loginError };
    }

    return { user: null };
}

function matchDispatchToProps(dispatch){
    return bindActionCreators({
        handleLogin: doLogin
    }, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(LoginContainer);
