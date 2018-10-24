/*
export function someMutation (state) {
}
*/
export { setConfigLanguages };

function setConfigLanguages(state, languages) {
  state.languages = languages;
}
