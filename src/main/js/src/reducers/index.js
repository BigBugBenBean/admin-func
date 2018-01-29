// import { combineReducers } from 'redux'

// import UserReducer from './reducer-user';

// const allReducers = combineReducers({
//     user: UserReducer
// });

// export default allReducers;

import { combineReducers } from 'redux';

// import history from '../utils/history';
import LoginReducer from '../routes/Login/reducer/login-reducer';
import LandingReducer from '../routes/Landing/reducer/landing-reducer';
import ApplicationFeeEnquiryReducer from '../routes/eServices2/Enquiry/ApplicationFeeEnquiry/reducer/application-fee-enquiry-reducer';
import eServicesMenuReducer from '../routes/eServices2/eServicesMenu/reducer/e-services-menu-reducer';

// import { reducers as apiReducers } from 'redux-api-call'

const USER_AUTH = 'USER_AUTH'
// ------------------------------------
// Action Handlers
// ------------------------------------
const ACTION_HANDLERS = {
  [USER_AUTH]    : (state, action) => action.payload
}

// ------------------------------------
// Reducer
// ------------------------------------
const initialState = {};
//const loginReducer = (state = initialState, action) => {
//  const handler = ACTION_HANDLERS[action.type]
//
//  return handler ? handler(state, action) : state
//}
const loginReducer = LoginReducer(initialState, ACTION_HANDLERS);
const landingReducer = LandingReducer(initialState, ACTION_HANDLERS);
const _eServicesMenuReducer = eServicesMenuReducer(initialState, ACTION_HANDLERS);
const _applicationFeeEnquiryReducer = ApplicationFeeEnquiryReducer(initialState, ACTION_HANDLERS);

const rootReducer = combineReducers({
    loginReducer,
    landingReducer,
    _eServicesMenuReducer,
    _applicationFeeEnquiryReducer,
})
export default rootReducer
