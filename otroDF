FROM alpine
RUN apk add nginx
CMD ["nginx", "-g", "daemon off;"]
EXPOSE 80
COPY ./ordinario-ftw /var/lib/nginx/html
COPY ./leo.conf /etc/nginx/http.d/default.conf