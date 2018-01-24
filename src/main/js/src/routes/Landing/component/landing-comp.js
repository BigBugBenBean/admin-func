import React from 'react'
import PropTypes from 'prop-types'
import {withRouter} from "react-router-dom";

// import './login-comp.scss';

export const Landing = ({  }) => (
        <div>
            <h3>landing</h3>
        </div>
)
Landing.propTypes = {
//  user: PropTypes.any.isRequired
}

//export default Login
export default withRouter(Landing)
