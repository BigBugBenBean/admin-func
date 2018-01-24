import React from 'react';
import { Route, Switch } from 'react-router-dom';
import asyncComponent from './asyncComponent';
// import CoreLayout from '../layouts/PageLayout';
// import Home from '../routes/Home';
// import todoRoute from '../routes/Todo';
// import redditRoute from '../routes/Reddit';
import loginRoute from '../routes/Login';
import landingRoute from '../routes/Landing';

const createRoutes = (store, history) => {
//   const Todo = asyncComponent(todoRoute(store));
//   const Reddit = asyncComponent(redditRoute(store));
//   const Login = asyncComponent(loginRoute(store));
    const Login = asyncComponent(loginRoute(store)); 
    const Landing = asyncComponent(landingRoute(store));
    
// const contextpath = "/adminfunc";
    const contextpath = "/" + window.location.href.split("//")[1].split("/")[1] + '';
    // const contextpath = '';
    

    const mainRoute = {
      root:       contextpath + '/',
      landing:    contextpath + '/landing',
    }

    console.log("TESTING123 - " + contextpath);
    console.log("TESTING - " + mainRoute.root);

  return (
    // <CoreLayout>
      <Switch >
        {/* <Route exact path="/" render={() => <h3>999</h3>} /> */}
        {/* <Route exact path={contextpath} render={() => <Login />} /> */}

        {/* <Route exact path="/" render={() => <h3>9876</h3> } /> */}
        {/* <Route path="/adminfunc/" render={() => <h3>23456</h3>} /> */}
        <Route path="/adminfunc/" render={() => <Login /> } />
        {/* <Route exact path={mainRoute.root} render={() => <h3>123234</h3> } /> */}
        {/* <Route exact path={contextpath + '/'} render={() => <h3>123212312334</h3> } /> */}
        {/* <Route path={contextpath + '/landing'} render={() => <h3>55555</h3> } /> */}
        {/* <Route path="/adminfunc/" render={() => <Login /> } /> */}

        {/* <Route path="/reddit" render={() => <Reddit />} /> */}
        {/* <Route path="/login" render={() => <Login />} /> */}
        {/* <Route path="/adminfunc/landing" render={() => <h3>888</h3>} /> */}
        {/* // <Route path="/adminfunc/landing" render={() => <h3>999</h3>} /> */}
        {/* <Route path="/adminfunc/landing" render={() => <Landing />} /> */}
      </Switch>
    // </CoreLayout>
  );
};

export default createRoutes;
;