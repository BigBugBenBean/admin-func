import { push } from 'react-router-redux';
import { connect } from 'react-redux'


import { onLogoutClicked } from '../action/landing-action'

import Landing from '../component/landing-comp'

const mapDispatchToProps = {
    onLogoutClicked,
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
    // userID: state.userID
})

export default connect(mapStateToProps, mapDispatchToProps)(Landing)
