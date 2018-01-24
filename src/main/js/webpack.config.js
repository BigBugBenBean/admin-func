path = require('path');
const webpack = require('webpack');

const HtmlWebpackPlugin = require('html-webpack-plugin');
const _ = require("lodash");

module.exports = function(webpackConfig, isDevelopment) {
  // console.log(JSON.stringify(webpackConfig))
  console.log('webpack is running...');
    return _.extend(webpackConfig, 
      {
    entry: [
      'react-hot-loader/patch',
      './src/index.js'
      // './src/containers/App'
    ], // string | object | array
    // Here the application starts executing
    // and webpack starts bundling
    output: {
    // options related to how webpack emits results
      path: path.resolve(__dirname, "dist"), // string
      // the target directory for all output files
      // must be an absolute path (use the Node.js path module)
      filename: "bundle.js", // string
      // the filename template for entry chunks

      // publicPath: '/',
      publicPath: "/adminfunc/",
    },
    resolve: {
      extensions: ['*', '.js', '.jsx']
    },
    module: {
      rules: [{
          test: /\.scss$/,
            use: [{
              loader: "style-loader"
            }, {
              loader: "css-loader" 
            }, {
              loader: "sass-loader"
            }]
      },
      {
            test: /\.jsx*$/,
            exclude: /(node_modules)/,
            // loaders: production ? ['babel-loader?presets[]=react,presets[]=es2015,presets[]=stage-2'] : ['react-hot', 'babel-loader?presets[]=react,presets[]=es2015,presets[]=stage-2']
            // loaders: ['babel-loader?presets[]=react,presets[]=env,presets[]=stage-2']
            loader: 'babel-loader',
            query: {
              presets: ['react', 'env', 'stage-0']
            }

      }]
      
    },
    plugins: [
      new webpack.HotModuleReplacementPlugin()
    ],
    devServer: {
      contentBase: './dist',
      hot: true
    }
  })
};