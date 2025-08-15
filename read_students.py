import sqlite3

# Connect to the database (make sure to create the same database file locally)
conn = sqlite3.connect('students.db')
cursor = conn.cursor()

# Read all student records
cursor.execute("SELECT * FROM STUDENTS")
rows = cursor.fetchall()

print("--- Student Records ---")
for row in rows:
    print("ID:", row[0], "  Name:", row[1], "  Marks:", row[2])

conn.close()
Add python script to read data from STUDENTS table
