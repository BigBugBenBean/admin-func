import React from 'react';
import  ReactDOM  from 'react-dom';
import { BrowserRouter as Router, Route } from 'react-router-dom';

import { Provider } from 'react-redux';
import { createStore } from 'redux'
import allReducers from './reducers'

import App from './App';
// import registerServiceWorker from './registerServiceWorker';

const store =createStore(
    allReducers,
);

ReactDOM.render(
    <Router>
        <Provider store={ store }>
            <App />
        </Provider>
    </Router>
, document.getElementById('root'));
// registerServiceWorker();
