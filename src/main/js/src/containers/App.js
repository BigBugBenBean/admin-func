import React, { Component } from 'react';
import { ConnectedRouter } from 'react-router-redux';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux'


import history from './../utils/history';
import configureStore from './../store/configureStore';
import createRoutes from './createRoutes';

// import * as util from '../utils/';

// import allReducers from './reducers'


// import createRoutes from './createRoutes';

// import Header from './containers/Header/header';
// import Home from './containers/Home/home';
// import Routers from './Routers';

// import LoginView from './../containers/Login/login-container';

// const store =createStore(
//   allReducers,
// );

// require('../config/env');
// util.config = require('../config/env.js');

const store = configureStore();

class App extends Component {
  render() {
    
    return (
      <Provider store={ store }>
        <ConnectedRouter history={ history }>
          { createRoutes(store) }
              {/* <div>123</div> */}
        </ConnectedRouter>
      </Provider>
    );
  }
}

export default App;

      