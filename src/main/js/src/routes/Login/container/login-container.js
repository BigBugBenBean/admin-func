import { push } from 'react-router-redux';

import { connect } from 'react-redux'
import { dispatchLogin } from '../action/login-action'
// import { handleLogin, dispatchLogin } from '../modules/reducers'

/*  This is a container component. Notice it does not contain any JSX,
    nor does it import React. This component is **only** responsible for
    wiring in the actions and state necessary to render a presentational
    component - in this case, the counter:   */

import Login from '../component/login-comp'

/*  Object of action creators (can also be function that returns object).
    Keys will be passed as props to presentational components. Here we are
    implementing our wrapper around increment; the component doesn't care   */

const mapDispatchToProps = {
  user: {},
  // handleLogin,
  dispatchLogin
}
//function mapDispatchToProps(dispatch) {
//    return {
//        routeActions: bindActionCreators(routeActions, dispatch),
//    }
//}
//function mapDispatchToProps(dispatch) {
//  return {
//    changeRoute: (url) => dispatch(push(url)),
//    dispatch,
//  };
//}

const mapStateToProps = (state, ownProps) => ({
  // userID : '54321',
  // login: state.login,
})

/*  Note: mapStateToProps is where you should use `reselect` to create selectors, ie:

    import { createSelector } from 'reselect'
    const login = (state) => state.login
    const tripleCount = createSelector(login, (count) => count * 3)
    const mapStateToProps = (state) => ({
      login: tripleCount(state)
    })

    Selectors can compute derived data, allowing Redux to store the minimal possible state.
    Selectors are efficient. A selector is not recomputed unless one of its arguments change.
    Selectors are composable. They can be used as input to other selectors.
    https://github.com/reactjs/reselect    */

export default connect(mapStateToProps, mapDispatchToProps)(Login)
