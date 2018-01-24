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

  return (
    // <CoreLayout>
      <Switch >
        {/* <Route exact path="/" render={() => <h3>999</h3>} /> */}
        <Route exact path="/" render={() => <Login />} />
        {/* <Route path="/reddit" render={() => <Reddit />} /> */}
        {/* <Route path="/login" render={() => <Login />} /> */}
        <Route path="/landing" render={() => <Landing />} />
      </Switch>
    // </CoreLayout>
  );
};

export default createRoutes;
