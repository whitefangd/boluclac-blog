/*
export function someGetter (state) {
}
*/
export { getLocale };

function getLocale(state) {
  return state.$locale.getLocale();
}
