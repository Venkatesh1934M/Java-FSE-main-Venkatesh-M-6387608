import React from 'react';

export const OddPlayers = (players) => {
  return (
    <div>
      {players.filter((_, i) => (i + 1) % 2 !== 0) 
              .map((p, i) => (
        <p key={i}>{p.position} : {p.name}</p>
      ))}
    </div>
  );
};


export const EvenPlayers = (players) => {
  return (
    <div>
      {players.filter((_, i) => (i + 1) % 2 === 0)
              .map((p, i) => (
        <p key={i}>{p.position} : {p.name}</p>
      ))}
    </div>
  );
};
export const ListofIndianPlayers = ({ IndianPlayers }) => {
  return (
    <ul>
      {IndianPlayers.map((p, i) => <li key={i}>{p}</li>)}
    </ul>
  );
};
