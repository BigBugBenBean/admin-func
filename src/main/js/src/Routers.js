import React from 'react'
import { Switch, Route } from 'react-router-dom'

// import Home from './Home'
// import Roster from './Roster'
// import Schedule from './containers/Schedule/schedule'

import LoginView from './containers/Login/login-container';
import LandingContainer from './containers/Landing/landing-container'

const Routers = () => (
  <main>
    <Switch>
      <Route exact path='/' component={LoginView}/>
      <Route path='/landing' component={LandingContainer}/>
      {/* <Route path='/schedule' component={Schedule}/> */}
    </Switch>
  </main>
)

export default Routers
