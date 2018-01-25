import React from 'react';
import { NavLink } from 'react-router-dom';
import PropTypes from 'prop-types';
import { Route, Switch } from 'react-router-dom';


const selected = { fontWeight: 'bold' };

const CoreLayout = ({ children }) => (
  <div className="">
    {/* <h1>React Redux Quickstart</h1> */}
    {/* <NavLink exact to="/" activeStyle={selected}>
      Home
    </NavLink>
    {' · '}
    <NavLink to="/todo" activeStyle={selected}>
      Todo
    </NavLink>
    {' · '}
    <NavLink to="/reddit" activeStyle={selected}>
      Reddit
    </NavLink>
    {' . '}
    <NavLink to='/login' activeStyle={selected}>
        Login
    </NavLink>
    <div className="">{children}</div> */}

  {/* <NavLink exact to="/adminfunc/" >Login</NavLink>.
  <NavLink exact to="/adminfunc/landing" >Landing</NavLink> */}

    {/* <h3>aaa: {children} bbb</h3> */}

    <div>{children}</div>

  </div>
);

CoreLayout.propTypes = {
  children: PropTypes.node
};

export default CoreLayout;