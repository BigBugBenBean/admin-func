import { push } from 'react-router-redux';
import { connect } from 'react-redux'


import {  } from '../action/e-services-menu-action'

import { REDUCER_PAGE } from '../../../../utils/enum';

import eServicesMenu from '../component/e-services-menu-comp'

const mapDispatchToProps = {

};


const mapStateToProps = (state, ownProps) => ({
    // user: state[REDUCER_PAGE.APPLICATION_FEE_ENQUIRY].landingReducer
});



export default connect(mapStateToProps, mapDispatchToProps)(eServicesMenu)
