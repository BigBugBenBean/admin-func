import { push } from 'react-router-redux';
import { connect } from 'react-redux'


import {  } from '../action/application-fee-enquiry-action'

import { REDUCER_PAGE } from '../../../../../utils/enum';

import ApplicationFeeEnquiry from '../component/application-fee-enquiry-comp'

const mapDispatchToProps = {

};


const mapStateToProps = (state, ownProps) => ({
    // user: state[REDUCER_PAGE.APPLICATION_FEE_ENQUIRY].landingReducer
});



export default connect(mapStateToProps, mapDispatchToProps)(ApplicationFeeEnquiry)
