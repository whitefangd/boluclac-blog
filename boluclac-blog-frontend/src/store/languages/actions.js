/*
export function someAction (context) {
}
*/
export { setLocale };

function setLocale(context, locate) {
  context.commit("setLocale", locate);
}
