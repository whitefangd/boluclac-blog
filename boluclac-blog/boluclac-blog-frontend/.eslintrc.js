module.exports = {
  root: true,
  parserOptions: {
    parser: 'babel-eslint',
    sourceType: 'module'
  },
  env: {
    browser: true
  },
  extends: [
    // https://github.com/vuejs/eslint-plugin-vue#priority-a-essential-error-prevention
    // consider switching to `plugin:vue/strongly-recommended` or `plugin:vue/recommended` for stricter rules.
    "plugin:vue/essential",
    // https://github.com/standard/standard/blob/master/docs/RULES-en.md
    "prettier",
    "prettier/standard",
    "plugin:vue/recommended"
  ],
  // required to lint *.vue files
  plugins: [
    "vue", "prettier"
  ],
  globals: {
    'ga': true, // Google Analytics
    'cordova': true,
    '__statics': true
  },
  // add your custom rules here
  'rules': {
    "prettier/prettier": "error"
  }
}
