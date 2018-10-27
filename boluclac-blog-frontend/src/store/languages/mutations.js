/*
export function someMutation (state) {
}
*/
export { setLocale };

function setLocale(state, locate) {
  state.locate = locate;
  this.$locale.changeLocale(locate);
}
