import React from 'react';
import {Route, Switch, Redirect} from 'react-router-dom';
import asyncComponent from './asyncComponent';
import CoreLayout from '../layouts/CoreLayout/core-layout';

import * as util from '../utils/';


import loginRoute from '../routes/Login';
import landingRoute from '../routes/Landing';
import eServicesMenuRoute from '../routes/eServices2/eServicesMenu'
import applicationFeeEnquiryRoute from '../routes/eServices2/Enquiry/ApplicationFeeEnquiry'

const createRoutes = (store, history) => {

    const Login = asyncComponent(loginRoute(store));
    const Landing = asyncComponent(landingRoute(store));
    const EServicesMenu = asyncComponent(eServicesMenuRoute(store));
    const ApplicationFeeEnquiry = asyncComponent(applicationFeeEnquiryRoute(store));

    const contextpath = "/" + window.location.href.split("//")[1].split("/")[1] + '';

    console.log("TESTING123 - " + contextpath);

    return (
        <CoreLayout>
            {/* <h1>123123123</h1> */}

            <Switch >
                <Route exact path={ contextpath + '/' } render={() => {
                  util.log('isLogined: ' + util.isLogined);
                  if (util.isLogined) {
                    // return (
                    //    <div>
                    //         <Landing />
                    //         <ApplicationFeeEnquiry />
                    //     </div>
                    // );
                  }

                  return <Login />;
                } }/>

                <Route exact path={ contextpath + '/applicationfeeenquiry' } render={() => {
                    if (util.isLogined) {
                        return (
                            <div>
                                <Landing />
                                <ApplicationFeeEnquiry />
                            </div>
                        );
                    }
                    return (<div>Landing</div>);
                 } }/>

                <Route exact path={ contextpath + '/eservicesmenu' } render={() => {
                    return (<div><EServicesMenu /></div>);
                }} />

                {/* <Route exact path="/adminfunc/landing" render={() => <div>Landing123</div> }/> */}


                {/* <Route exact path="/adminfunc/landing" render={() => <div>Landing</div> } /> */}
            </Switch>

            {/* <Route path="/adminfunc/" render={() => <Login /> } /> */}
            {/* <Route exact path="/" render={() => <h3>999</h3>} /> */}
            {/* <Route exact path={contextpath} render={() => <Login />} /> */}

            {/* <Route exact path="/" render={() => <h3>9876</h3> } /> */}
            {/* <Route path="/adminfunc/" render={() => <h3>23456</h3>} /> */}

            {/* <Route exact path={mainRoute.root} render={() => <h3>123234</h3> } /> */}
            {/* <Route exact path={contextpath + '/'} render={() => <h3>123212312334</h3> } /> */}
            {/* <Route path={contextpath + '/landing'} render={() => <h3>55555</h3> } /> */}
            {/* <Route path="/adminfunc/" render={() => <Login /> } /> */}

            {/* <Route path="/reddit" render={() => <Reddit />} /> */}
            {/* <Route path="/login" render={() => <Login />} /> */}
            {/* <Route path="/adminfunc/landing" render={() => <h3>888</h3>} /> */}
            {/* // <Route path="/adminfunc/landing" render={() => <h3>999</h3>} /> */}
            {/* <Route path="/adminfunc/landing" render={() => <Landing />} /> */}

        </CoreLayout>
    );
};

export default createRoutes;
;