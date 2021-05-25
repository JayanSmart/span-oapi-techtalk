import json
import datetime
import dateutil.parser

from swagger_server.models.employee_info_schema import EmployeeInfoSchema

json_data = None

def add_employee(name, start_date):
    with open("../data/employee_data.json", 'r') as file:
        json_data = json.dumps(file)
    
    new_id = len(json_data['employees']) + 1
    new_employee = { 'id': new_id, 'name': name, 'start_date': start_date}
    json_data['employees'].append(new_employee)

    with open("../data/employee_data.json", 'w') as file:
        json.dump(json_data, file)

    return EmployeeInfoSchema(new_id, name, calculate_tenure(start_date))

def calculate_tenure(start_date):
    current_date = datetime.datetime.now().date()
    start_date = dateutil.parser.parse(start_date).date()
    tenure = current_date - start_date
    return tenure.days
    