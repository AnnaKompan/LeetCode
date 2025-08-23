// Time: O(n*m log m) n-num str, m-str length log-sorting
// Space: O(n)

const strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"];
const strs2 = [""];
const strs3 = ["a"];

function groupAnagrams(strs) {
  const map = new Map();
  for (const s of strs) {
    const key = s.split("").sort().join("");
    if (!map.has(key)) {
      map.set(key, []);
    }
    map.get(key).push(s);
  }
  return Array.from(map.values());
}

console.log(`Groups of anagrams are: ${groupAnagrams(strs1)}`);
console.log(`Groups of anagrams are: ${groupAnagrams(strs2)}`);
console.log(`Groups of anagrams are: ${groupAnagrams(strs3)}`);
