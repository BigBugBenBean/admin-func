import React, { Component } from 'react'
import PropTypes from 'prop-types'
import { withRouter } from "react-router-dom";
import { } from '../action/e-services-menu-action';

import * as util from '../../../../utils/';

// import '../../../styles/style.css';



const eServicesMenu = ({ }) => (
    <div>
        <h1>eServicesMenu</h1>


    </div>
)


eServicesMenu.propTypes = {
    // user: PropTypes.any.isRequired

}

// export default ApplicationFeeEnquiry
export default withRouter(eServicesMenu)
