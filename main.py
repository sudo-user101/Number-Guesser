from flask import Flask, request, render_template_string, redirect, url_for
import sqlite3

app = Flask(__name__)

# Function to get a database connection.
# This function connects to database with the name `database.db`
def get_db_connection():
    conn = sqlite3.connect('database.db')
    conn.row_factory = sqlite3.Row
    return conn

# Function to create a new database if it doesn't exist
def init_db():
    conn = get_db_connection()
    conn.execute('CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)')
    conn.close()

@app.route('/', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        # Validate the credentials here
        # ...

        # Insert the new user into the database
        conn = get_db_connection()
        conn.execute('INSERT INTO users (username, password) VALUES (?, ?)', (username, password))
        conn.commit()
        conn.close()

        return redirect(url_for('login'))  # Redirect to login page after inserting data

    # HTML content
    html_content = '''<!DOCTYPE html>
   
    return render_template_string(html_content)

if __name__ == '__main__':
    init_db()  # Initialize the database
    app.run(debug=True)
