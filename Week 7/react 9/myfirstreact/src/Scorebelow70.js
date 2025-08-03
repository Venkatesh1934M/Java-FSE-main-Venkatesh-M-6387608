import React from 'react';

const Scorebelow70 = ({ players }) => {
  const filtered = players.filter(p => p.score < 70); // Arrow function
  return (
    <ul>
      {filtered.map((p, index) => (
        <li key={index}>{p.name} {p.score}</li>
      ))}
    </ul>
  );
};

export default Scorebelow70;
