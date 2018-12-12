/*
export function someGetter (state) {
}
*/
export { getConfigLanguages, getGoogleClientId };

function getConfigLanguages(state) {
  return state.languages;
}

function getGoogleClientId(state) {
  return state.google_client_id;
}
