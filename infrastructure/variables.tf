variable "lambda_function_filename" {
  default = "lambda-files/url-shortener-create-short-url-lambda.zip"
  description = "Name of the zip file we will upload as the lambda"
  type = "string"
}

variable "lambda_s3_bucket" {
  description   = "Name of the S3 bucket where we want to store our code"
  type          = "string"
}

variable "lambda_s3_key" {
  default 	= "createshorturl-0.0.1-SNAPSHOT.jar"
  description   = "Object key of the S3 bucket where we want to store our code"
  type          = "string"
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

variable "iam_for_lambda_arn" {
  description   = "ARN for the IAM role for the lambda"
  type          = "string"
}
