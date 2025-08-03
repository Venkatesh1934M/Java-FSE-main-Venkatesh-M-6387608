import React from 'react';

const ListofPlayers = ({ players }) => {
  return (
    <ul>
      {players.map((p, index) => (
        <li key={index}>{p.name} {p.score}</li>
      ))}
    </ul>
  );
};

export default ListofPlayers;
