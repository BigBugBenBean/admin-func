import React, { Component } from 'react'
import PropTypes from 'prop-types'
import { withRouter } from "react-router-dom";
import { } from '../action/application-fee-enquiry-action';

import * as util from '../../../../../utils/';

// import '../../../styles/style.css';



const ApplicationFeeEnquiry = ({ }) => (
    <div>

        <h3>ApplicationFeeEnquiry</h3>

        <div>
            <input type="hidden" name="org.apache.struts.taglib.html.TOKEN" value="b00a84f0f308c3d6bd9171480e8b99c3" />
        </div>
                        
        {/* <table border="0" cellSpacing="0" cellPadding="0">
            <tbody>
                <tr>
                    <td width="15" bgcolor="#C7DBB8">
                        <img height="20" src="./static/bottom_left.png" width="15" />
                    </td>
                    <td width="100%" bgcolor="#C7DBB8" colSpan="4">
                        <img height="20" src="./static/spacer.gif" width="15" />
                    </td>
                    <td width="15" bgcolor="#C7DBB8">
                        <img height="20" src="./static/bottom_right.png" width="15" />
                    </td>
                </tr>
            </tbody>
        </table> */}

        </div>
        )


ApplicationFeeEnquiry.propTypes = {
            // user: PropTypes.any.isRequired

        }

        // export default ApplicationFeeEnquiry
        export default withRouter(ApplicationFeeEnquiry)
