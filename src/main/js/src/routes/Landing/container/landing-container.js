import { push } from 'react-router-redux';
import { connect } from 'react-redux'


import { onLogoutClicked } from '../action/landing-action'

import { REDUCER_PAGE } from '../../../utils/enum';

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
    user: state[REDUCER_PAGE.LANDING_PAGE].landingReducer.user,
    // user: {user: {id: '789', password: '5678'}}
})

// const mapStateToProps = () => {
//     return state => ({
//         user: state.user
//     });
// }

export default connect(mapStateToProps, mapDispatchToProps)(Landing)
