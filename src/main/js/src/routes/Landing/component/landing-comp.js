import React from 'react'
import PropTypes from 'prop-types'
import {withRouter} from "react-router-dom";

// import '../../../styles/style.css';

export const Landing = ({  }) => (
        <div>
            <h3>landing</h3>
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
                <div className="TopLabel header-tab header-tab-active"><b >e-Services-2</b></div>
                <div className="TopLabel header-tab "><b >SMARTICS-2</b></div>
                <div className="TopLabel header-tab "><b >RM</b></div>
                <div style={{  flex: 'auto' }}></div>
                {/* <div style={{  width: '100%' }}></div> */}
                {/* <div className="flex-item-1 nav-title-exit">
                    <span >Exit</span>
                    <span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                </div> */}

                <div className="TopLabel nav-title-exit"><b >Exit</b></div>

                </div>
            </div>
        </div>
)
Landing.propTypes = {
//  user: PropTypes.any.isRequired
}

//export default Login
export default withRouter(Landing)
