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

const rootReducer = combineReducers({
    loginReducer,
    landingReducer,
})
export default rootReducer
