/*
export function someGetter (state) {
}
*/
export { getConfigLanguages };

function getConfigLanguages(state) {
  return state.languages;
}
