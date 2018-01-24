import React, { Component } from 'react';

import { BrowserRouter as Router, Route } from 'react-router-dom';

// import Header from './containers/Header/header';
// import Home from './containers/Home/home';
import Routers from './Routers';

import LoginView from './containers/Login/login-container';

class App extends Component {
  render() {
    return (
      <div>
        {/* <ul>
          <li><Route exact path="/" component={'Title'} /></li>
          <li><Route path="/list" component={'List'} /></li>
        </ul> */}
        {/* <Header /> */}
        <Routers />

        {/* <LoginView /> */}
      </div>
    );
  }
}

export default App;
