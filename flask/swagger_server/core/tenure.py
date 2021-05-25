import json
import datetime
import dateutil.parser

from swagger_server.models.employee_info_schema import EmployeeInfoSchema

def calculate_tenure(start_date):
    current_date = datetime.datetime.now().date()
    start_date = dateutil.parser.parse(start_date).date()
    tenure = current_date - start_date
    return tenure.days
    