# Task Part 2 compulsory
# Task_manager.py
# Written by: katleho
# Date Written: 03/03/20

tasks_file = open('tasks.txt','r+')
user_file = open('user.txt', 'r+')


currentdate = date.today()
username = input("Enter user name: ")
password = input("Enter password: ")
user_option = ""

for line in user_file:
    read_User_file = line
    credentials = read_User_file.split(", ")
if username == credentials[0] and password == credentials[1]:
        if username == "admin":
            print ("Please select on the following option: ")
            print("r - register user: ")
            print("s - Statistics:")
            print("a - add task: ")
            print("va - view all tasks: ")
            print("vm - view my tasks: ")
            print("e - exit:")
            user_option = input("")
            break
        else:
            print ("Please select on the following option: ")
            print("a - add task: ")
            print("va - view all tasks: ")
            print("vm - view my tasks: ")
            print("e - exit:")
            user_option = input("")
            break
    else:
        user_option = "Wrong user name or password"

if user_option == "r" and username == "admin":
    new_username = input("Enter a new user name: ")
    new_password = input("Enter a new password: ")
    confirm_password = input("Re-enter your password: ")
    if new_password == confirm_password:
        user_file.read()
        user_file.write(", \n"+new_username+", "+new_password)
    else:
        print("Passwords don't match each other: ")
elif user_option == "a":
    new_task_username = input("Enter a username: ")
    new_task_title = input("Enter the title of the task: ")
    new_task = input("Enter the description the task: ")
    new_task_date = input("Enter the task due date: ")
    tasks_file.read()
    tasks_file.write("\n"+new_task_username+", "+new_task_title+", "+new_task+ ", "+ str(currentdate)+", "+new_task_date+", NO")
elif user_option == "va":
    print("Tasks: Register users with taskmanager.py")
    for lines in tasks_file:
        read_tasks = lines
        tasks = read_tasks.split(", ")
        print("Task assigned to: "+ tasks[0]+ "\nTask title: "+tasks[1]+"\nTask Description: "+ tasks[2] + "\nAssignment Date:"+ tasks[3]+
        "\nTask Due date: "+ tasks[4]+ "\nTask Completed?: "+ tasks[5])
elif user_option == "vm":
    print("Task for user "+ username)
    for line in tasks_file:
        read_tasks = line
        tasks = read_tasks.split(", ")
        if username == tasks[0]:
           print("Task assigned to: "+ tasks[0]+ "\nTask title: "+tasks[1]+"\nTask Description: "+ tasks[2] + "\nAssignment Date:"+ tasks[3]+
            "\nTask Due date: "+ tasks[4]+ "\nTask Completed?: "+ tasks[5]) 
elif user_option == "s" and username == "admin":
    total_num_task = 0
    tota_num_users = 0
    for lines in tasks_file:
        total_num_task +=1
    for lines in user_file:
        tota_num_users += 1
    print("The total number of users is "+ str(total_num_users))
    print("The total number of task(s) is "+ str(total_num_task))
else:
    print(user_option)



user_file.close()
tasks_file.close()