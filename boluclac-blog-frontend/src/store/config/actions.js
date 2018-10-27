/*
export function someAction (context) {
}
*/
export { setConfigLanguages };

function setConfigLanguages(context, languages) {
  context.commit("setConfigLanguages", languages);
}
