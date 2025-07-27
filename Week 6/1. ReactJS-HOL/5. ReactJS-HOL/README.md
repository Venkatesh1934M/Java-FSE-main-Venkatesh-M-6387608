# React Hands-on 5 – Cohort Dashboard Styling

This project is part of React Hands-on Lab 5, focused on applying styling to a cohort dashboard using React.

## 📁 Folder Structure

- `cohorttracker/` – React app folder (unzipped from the provided zip)
- `output/` – Contains the final result screenshot

> All changes were made inside the `cohorttracker` folder.

---

## 🧑‍💻 What Was Done

- Styled the cohort display using **CSS Modules**
- Applied **inline styles** to change the heading color dynamically:
  - Green if the cohort status is **ongoing**
  - Blue for all other statuses

---

## 📝 Code Changes

### ✅ `CohortDetails.module.css`

Created a new CSS module file:

```css
.box {
  width: 300px;
  display: inline-block;
  margin: 10px;
  padding: 10px 20px;
  border: 1px solid black;
  border-radius: 10px;
}

dt {
  font-weight: 500;
}
```

---

### ✅ `CohortDetails.js`

Updated to:

```jsx
import styles from './CohortDetails.module.css';

function CohortDetails(props) {
    const isOngoing = props.cohort.currentStatus.toLowerCase() === 'ongoing';

    return (
        <div className={styles.box}>
            <h3 style={{ color: isOngoing ? 'green' : 'blue' }}>
                {props.cohort.cohortCode} -
                <span>{props.cohort.technology}</span>
            </h3>
            <dl>
                <dt>Started On</dt>
                <dd>{props.cohort.startDate}</dd>
                <dt>Current Status</dt>
                <dd>{props.cohort.currentStatus}</dd>
                <dt>Coach</dt>
                <dd>{props.cohort.coachName}</dd>
                <dt>Trainer</dt>
                <dd>{props.cohort.trainerName}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;
```

---

## 🚀 How to Run the Project

1. Open terminal and navigate to the `cohorttracker` folder:
   ```
   cd cohorttracker
   ```

2. Install dependencies:
   ```
   npm install
   ```

3. Start the app:
   ```
   npm start
   ```

4. Open your browser at:
   ```
   http://localhost:3000
   ```

---

## 📸 Output

You can find the final UI screenshot in the `output/` folder.

---

## ✅ Summary

- Used CSS Module to style the card layout
- Applied dynamic color using inline style for the heading
- Final output displays cohort cards with color-coded headings based on status
