import React, { Component } from 'react'
import PropTypes from 'prop-types'
import {withRouter} from "react-router-dom";
import { onLogoutClicked } from '../action/landing-action';

import * as util from '../../../utils/';

import ApplicationFeeEnquiry from '../../eServices2/Enquiry/ApplicationFeeEnquiry';

// import '../../../styles/style.css';

var test = '321';
var names = ['Jake', 'Jon', 'Thruster'];

var tabs = [
    {
        id: 0,
        name: 'e-Services-2',
        isSelected: true
    },
    {
        id: 1,
        name: 'SMARTICS-2',
        isSelected: false,
    },
    {
        id: 2,
        name: 'RM',
        isSelected: false,
    }
];

const Landing = ({ user, onLogoutClicked }) => (
        <div>
            {/* <h3>landing</h3> */}

            <ul>
                {names.map(function(name, index){
                    return <li key={ index }>{name}</li>;
                  })}
                <li>{ user.user.id } | {user.user.password}</li>
                {/* <li>{ user } | {user}</li> */}
            </ul>


            <div className="flex-container">
                <div className="flex-item-1 header-item-left">
                <span>e-Services 2</span>
                </div>
                <div style={{  }}></div>
                <div className="flex-item-1 header-item-right">
                <span>| UserID: <b>123</b> | </span>
                <span>Date: <b> Wednesday, 3 January 2018</b></span>
                </div>
            </div>
            <div className="content-container">
                <div className="flex-container" style={{ width:'100%', height: '25px', backgroundColor: '#BF5564' }}>
                <div className="" style={{ width: '20px' }}><span>&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
                
                {tabs.map((tab, index) => {
                    let isSelectedStr = '';
                    if (tab.isSelected) {
                        isSelectedStr = ' header-tab-active';
                    }
                    return <div className={ `TopLabel header-tab ${isSelectedStr}` } key={tab.id}><b >{tab.name}</b></div>
                })}

                {/* <div className="TopLabel header-tab header-tab-active"><b >e-Services-2</b></div>
                <div className="TopLabel header-tab "><b >SMARTICS-2</b></div>
                <div className="TopLabel header-tab "><b >RM</b></div> */}


                <div style={{  flex: 'auto' }}></div>
                {/* <div style={{  width: '100%' }}></div> */}
                {/* <div className="flex-item-1 nav-title-exit">
                    <span >Exit</span>
                    <span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                </div> */}

                <div className="TopLabel nav-title-exit" ><b onClick={onLogoutClicked} >Exit</b></div>

                </div>
            </div>

            <div>
                456456
                {/*<ApplicationFeeEnquiry />*/}
            </div>

        </div>
)



Landing.propTypes = {
    // user: PropTypes.any.isRequired
    
}

// export default Landing
export default withRouter(Landing)
