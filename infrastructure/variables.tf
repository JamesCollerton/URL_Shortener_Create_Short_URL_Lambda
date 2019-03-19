variable "lambda_function_filename" {
  default = "url-shortener-create-short-url-lambda.zip"
  description = "Name of the zip file we will upload as the lambda"
  type = "string"
}

variable "lambda_function_name" {
  default = "url-shortener-create-short-url-lambda"
  description = "Name we would like to assign to the lambda function"
  type = "string"
}

variable "lambda_function_handler" {
  default = "URLShortenerCreateShortURL::apply"
  description = "The name of the method invoked in the lambda, given Class::method"
  type = "string"
}

variable "aws_profile" {
  default 	= "lambdaadministrator"
  description 	= "Profile to be used"
  type        	= "string"
}

variable "aws_region" {
  default 	= "eu-west-1"
  description 	= "Region to be used"
  type        	= "string"
}

