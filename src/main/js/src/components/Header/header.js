import React, { Component } from 'react'
import { Link } from 'react-router-dom'


import { UserAPI, TabsAPI } from '../../APIs'

// import '../Login/login.css';
import '../../styles/style.css';

// const Header = () => (

class Header extends Component {

  constructor(props) {
    super(props);
    console.log('Header_constructor');
    console.log(props);
  }

  render() {
    return (
      <div>
          {/* <ul>
            <li><Link to='/'>Home</Link></li>
            <li><Link to='/roster'>Roster</Link></li>
            <li><Link to='/schedule'>Schedule</Link></li>
          </ul> */}

          {/* <div>1111</div> */}

          {/* { UserAPI } */}

          {/* <div>1111</div> */}

          <div className="flex-container">
            <div className="flex-item-1 header-item-left">
              <span>e-Services 2</span>
            </div>
            <div style={{  }}></div>
            <div className="flex-item-1 header-item-right">
              <span>| UserID: <b>123</b> | </span>
              <span>Date: <b> Wednesday, 3 January 2018</b></span>
            </div>
          </div>
          <div className="content-container">
            <div className="flex-container" style={{ width:'100%', height: '25px', backgroundColor: '#BF5564' }}>
              <div className="" style={{ width: '20px' }}><span>&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
              <div className="TopLabel header-tab header-tab-active"><b >Enquiry</b></div>
              <div className="TopLabel header-tab "><b >Maintenance</b></div>
              <div className="TopLabel header-tab "><b >Management</b></div>
              <div className="TopLabel header-tab "><b >SMARTICS-2</b></div>
              <div style={{  flex: 'auto' }}></div>
              {/* <div style={{  width: '100%' }}></div> */}
              {/* <div className="flex-item-1 nav-title-exit">
                <span >Exit</span>
                <span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
              </div> */}

              <div className="TopLabel nav-title-exit"><b >Exit</b></div>

            </div>
          </div>

          <div className="flex-container content-nav-container">
            <div className="flex-item-1 nav-title-left">
              <span style={{ width: '100%' }}>Login</span>
            </div>
            <div style={{  }}></div>
            <div className="flex-item-1 nav-title-right">
              <span style={{ width: '100%' }}>ASC0001</span>
            </div>
          </div>


            {/* <div className="content-container">
                <div style={{ width:'100%', height: '25px', backgroundColor: '#aa4747' }}>{ }</div>
                <div className="flex-container content-nav-container">
                <div className="flex-item-1 nav-title-left">
                    <span style={{ width: '100%' }}>Login</span>
                </div>
                <div style={{  }}></div>
                <div className="flex-item-1 nav-title-right">
                    <span style={{ width: '100%' }}>ASC0001</span>
                </div>
            </div> */}
      </div>
    );
  }


};
// )

export default Header
