# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.employee_info_schema import EmployeeInfoSchema  # noqa: E501
from swagger_server.models.input_error import InputError  # noqa: E501
from swagger_server.models.server_error import ServerError  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_tenure_by_id(self):
        """Test case for get_tenure_by_id

        get tenure by ID
        """
        query_string = [('id', 1)]
        response = self.client.open(
            '/v1/tenure',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_versions(self):
        """Test case for list_versions

        List API versions
        """
        response = self.client.open(
            '/v1/',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_tenure(self):
        """Test case for patch_tenure

        Update the start date of an employee.
        """
        query_string = [('id', 56),
                        ('start_date', 'start_date_example')]
        response = self.client.open(
            '/v1/tenure',
            method='PATCH',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_tenure(self):
        """Test case for post_tenure

        POST new employee information
        """
        query_string = [('employee_name', 'employee_name_example'),
                        ('start_date', '2013-10-20')]
        response = self.client.open(
            '/v1/tenure',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
