import React from 'react';
import ReactDOM  from 'react-dom';
import { BrowserRouter as Router, Route } from 'react-router-dom';



import App from './containers/App';
// import registerServiceWorker from './registerServiceWorker';


ReactDOM.render(<App />, document.getElementById('root'));
// registerServiceWorker();

// const title = 'My Minimal React Webpack Babel Setup 123';

// ReactDOM.render(
//   <div>{title}</div>,
//   document.getElementById('root')
// );